package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 */
public class DefangingIPAddress {

    public String defangIPaddr(String address) {

        if (address == null || address.isEmpty()) {
            return "";
        }

        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        DefangingIPAddress defangingIPAddress = new DefangingIPAddress();
        var defangingIP = defangingIPAddress.defangIPaddr("1.1.1.1");
        System.out.println("defangingIP = " + defangingIP);
    }
}
