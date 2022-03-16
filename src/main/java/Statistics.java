class Statistics {


    public boolean isGreenLight;
    public int maxSpeed;

    public Statistics (boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }



    public int alldroppedOut(int[] speedOfPlayer) { // количество выбывающих
        int sumDroppedOut = 0;

        for (int speed : speedOfPlayer) {
            if (isGreenLight) {
                sumDroppedOut += 0;
            } else {
                if (speed > maxSpeed) {
                    sumDroppedOut++;


                }
            }
        }
        return sumDroppedOut;
    }


    public int[] droppedOut(int[] speedOfPlayer) {
        int cnt = 0;
        for (int speed : speedOfPlayer) { // счетчик размера массива
            if (isGreenLight) {
            } else {
                if (speed > maxSpeed) {
                    cnt++;
                }
            }
        }

        int[] ans = new int[cnt];
        int i = 0;
        for (int speed : speedOfPlayer) { //массив выбывающих
            if (isGreenLight) {
            } else {
                if (speed > maxSpeed) {
                    ans[i] = speed;
                    i++;
                }
            }
        }
        return ans;
    }

    public  int[] remain(int[] speedOfPlayer) {
        int cnt = 0;
        for (int speed : speedOfPlayer) { // счетчик для массива
            if (isGreenLight) {
                cnt++;
            } else {
                if (speed <= maxSpeed) {
                    cnt++;
                }
            }
        }

        int[] ans1 = new int[cnt];
        int ii = 0;
        for (int speed : speedOfPlayer) { //массив выживших
            if (isGreenLight) {
                ans1[ii] = speed;
                ii++;
            } else {
                if (speed <= maxSpeed) {
                    ans1[ii] = speed;
                    ii++;
                }
            }
        }
        return ans1;
    }


    public String[] listName(String[] nameSpeed) {

        int cnt = 0;
        int cnt2 = 0;

        for (String part : nameSpeed) {
            String[] list = part.split(" ");
            int speed = Integer.parseInt(list[1]);
            if (isGreenLight) {
                cnt++;
            } else {
                if (speed <= maxSpeed) {
                    cnt++;
                }
            }
        }

        String[] listName = new String[cnt];
        for (String part : nameSpeed) {
            String[] list = part.split(" ");
            String name = list[0];
            int speed = Integer.parseInt(list[1]);
            if (isGreenLight) {
                listName[cnt2] = name;
                cnt2++;

            } else {
                if (speed <= maxSpeed) {
                    listName[cnt2] = name;
                    cnt2++;
                }
            }
        }

        return listName;
    }
}