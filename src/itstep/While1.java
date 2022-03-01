package itstep;

public class While1 {
    public static void main(String[] args) {
        int length = 1;
        int way = 0;
/*
        //for (int i=1; i<50;i++){
            //way+=length;
           // length++;
            //System.out.println(way);
            //if (way>=50) {
                //System.out.println(i);
                //break;
            }


        }
    }
}

 */

        int n = 0;
        while (way < 50) {
            way += length;
            length++;
            n++;
        }
        System.out.println(n);
    }
    }
