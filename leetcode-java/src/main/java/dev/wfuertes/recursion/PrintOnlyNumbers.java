package dev.wfuertes.recursion;

public class PrintOnlyNumbers {

    public void print(Object[] array) {
        for (var item : array) {
            if (item instanceof Object[]) {
                print((Object[]) item);
            } else {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        var service = new PrintOnlyNumbers();

        var input = new Object[] {
                1,
                2,
                3,
                new Object[] { 4, 5, 6 },
                7,
                new Object[] {
                        8,
                        new Object[] {
                                9, 10, 11,
                                new Object[] { 12, 13, 14 }
                        }
                },
                new Object[] {
                        15, 16, 17, 18, 19,
                        new Object[] {
                                20, 21, 22,
                                new Object[] {
                                        new Object[] {
                                                23, 24, 25,
                                                new Object[] { 26, 27, 29 }
                                        }, 30, 31
                                }, 32
                        }, 33
                }
        };
        service.print(input);
    }
}
