package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/subdomain-visit-count/
 */
public class SubdomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {

        Map<String, Integer> map = new HashMap<>();

        for (var item : cpdomains) {

            var spaceIndex = item.indexOf(" ");
            var number = Integer.parseInt(item.substring(0, spaceIndex));
            var domain = item.substring(spaceIndex + 1, item.length());
            var domainArray = domain.split("\\.");

            for (var i = 0; i < domainArray.length; i++) {

                var element = String.join(".",
                        Arrays.copyOfRange(domainArray, i, domainArray.length));

                var currentAmount = map.get(element) == null ? 0 : map.get(element);
                map.put(element, currentAmount + number);

                System.out.println(element);
            }
        }

        var list = new ArrayList<String>();

        map.entrySet()
                .forEach(element -> {
                    StringBuilder sb = new StringBuilder();
                    list.add(sb.append(element.getValue())
                            .append(" ")
                            .append(element.getKey()).toString());
                });

        return list;
    }

    public static void main(String[] args) {
        SubdomainVisitCount count = new SubdomainVisitCount();
        var result = count.subdomainVisits(new String[]{"900 google.mail.com",
            "50 yahoo.com",
            "1 intel.mail.com",
            "5 wiki.org"});
        System.out.println("result = " + result);
    }
}
