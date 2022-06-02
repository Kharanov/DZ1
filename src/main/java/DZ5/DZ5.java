package DZ5;

public class DZ5 {
    public static void main(String[] args) {
        Employer[] employArray = new Employer[5];
        employArray[0] = new Employer("Kharanov Konstantin", "engineer", "wqed@gmail.com", "89183840268", 40000, 32);
        employArray[1] = new Employer("Medvedev Serfey", "engineer", "yjgfw@gmail.com", "89189778544", 44000, 45);
        employArray[2] = new Employer("Ryaskov Jyuriy", "universal specialist", "hjkgu@gmail.com", "89649246947", 35000, 53);
        employArray[3] = new Employer("Shabo Anatoliy", "driver", "kuyghuy@gmail.com", "89247385060", 25000, 49);
        employArray[4] = new Employer("Lefterov", "universal specialist", "sdfxd@gmail.com", "89187593067", 28000, 61);
        for (int i = 0; i < employArray.length; i++) {
            if (employArray[i].age > 40) {
                employArray[i].printEmployer();
            }
        }
    }
}


