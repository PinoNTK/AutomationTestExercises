package pino.code.little;

import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {
    public static class VanDongVien {
        String Hoten;
        Integer Tuoi;
        Float CanNang;
        Float ChieuCao;

        public VanDongVien(String Hoten, Integer Tuoi, Float CanNang, Float ChieuCao) {
            this.Hoten = Hoten;
            this.Tuoi = Tuoi;
            this.CanNang = CanNang;
            this.ChieuCao = ChieuCao;
        }

        public String Info() {
            String fullInfo = "\nHo ten: " + this.Hoten + "\nTuoi: " + this.Tuoi + "\nCan nang: " + this.CanNang + "\nChieu cao: " + this.ChieuCao;
            System.out.println(fullInfo);
            return fullInfo;
        }

        public boolean SoSanh(VanDongVien vanDongVien) {
            if (this.ChieuCao > vanDongVien.ChieuCao) {
                System.out.println("Van dong vien " + this.Hoten + " lon hon " + " van dong vien " + vanDongVien.Hoten);
                return true;
            } else {
                System.out.println("Van dong vien " + this.Hoten + " nho hon " + " van dong vien " + vanDongVien.Hoten);
                return false;
            }
        }

    }
    public static class CauThu extends VanDongVien {
        String Caulacbo;
        Integer LuongTuan;

        public CauThu(String Hoten, Integer Tuoi, Float CanNang, Float ChieuCao, String Caulacbo, Integer LuongTuan) {
            super(Hoten, Tuoi, CanNang, ChieuCao);
            this.Caulacbo = Caulacbo;
            this.LuongTuan = LuongTuan;
        }


        public String Info() {
            String fullInfo = "\nHo ten: " + this.Hoten + "\nTuoi: " + this.Tuoi + "\nCan nang: " + this.CanNang +
                    "\nChieu cao: " + this.ChieuCao + "\nCau lac bo: " + this.Caulacbo + "\nLuong tuan: "
                    + this.LuongTuan;
            System.out.println(fullInfo);
            return fullInfo;
        }

        public boolean SoSanh(CauThu cauThu) {
            if (this.LuongTuan > cauThu.LuongTuan) {
                System.out.println("Cau thu " + this.Hoten + " luong cao hon cau thu " + cauThu.Hoten);
                return true;
            } else {
                System.out.println("Cau thu " + this.Hoten + " luong thap hon cau thu " + cauThu.Hoten);
                return false;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Today is your birthday 25/05!");
        VanDongVien nhi = new VanDongVien("Nguyen Thi Tuyet Nhi", 24, 40f, 155f);
        nhi.Info();

        List<CauThu> lstCauThu = new ArrayList<CauThu>();
        CauThu ct1 = new CauThu("Nguyen Thi Tuyet Nhi 1", 24, 40f, 155f, "Germany", 1000);
        CauThu ct2 = new CauThu("Nguyen Thi Tuyet Nhi 2", 25, 40f, 155f, "Germany", 2000);
        CauThu ct3 = new CauThu("Nguyen Thi Tuyet Nhi 3", 26, 40f, 155f, "Germany", 3000);
        CauThu ct4 = new CauThu("Nguyen Thi Tuyet Nhi 4", 27, 40f, 155f, "Germany", 4000);
        CauThu ct5 = new CauThu("Nguyen Thi Tuyet Nhi 5", 28, 40f, 155f, "Germany", 5000);
        CauThu ct6 = new CauThu("Nguyen Thi Tuyet Nhi 6", 29, 40f, 155f, "Germany", 6000);
        lstCauThu.add(ct1);
        lstCauThu.add(ct3);
        lstCauThu.add(ct5);
        lstCauThu.add(ct4);
        lstCauThu.add(ct2);
        lstCauThu.add(ct6);
        System.out.println("=============================");
        System.out.println("\nDanh sach cau thu:");
        for (CauThu ct : lstCauThu) {
            ct.Info();
            System.out.println("--------------------------");
        }
        // sap xep theo bubble sort
        for (int i = 0; i < lstCauThu.size(); i++) {
            for (int j = i+1; j < lstCauThu.size(); j++) {
                if (lstCauThu.get(i).SoSanh(lstCauThu.get(j))) {
                    CauThu temp = lstCauThu.get(i);
                    lstCauThu.set(i, lstCauThu.get(j));
                    lstCauThu.set(j, temp);
                }
            }
        }
        System.out.println("=============================");
        System.out.println("\nDanh sach cau thu sau khi sap xep:");
        for (CauThu ct : lstCauThu) {
            ct.Info();
            System.out.println("--------------------------");
        }
    }
}
