package com.mycompany.number.guessing.game;

import java.util.*;
import java.io.UnsupportedEncodingException;

public class NumberGuessingGame {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        int kyLuc = Integer.MAX_VALUE;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in, "UTF-8");
        int chon = -1;

        do {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Chào mừng đến với Number Guessing Game");
            System.out.println("Máy sẽ random một số bí mật và nhiệm vụ của bạn là đoán số đó.");
            System.out.println("Gợi ý: Quá Cao | Quá Thấp | Chính Xác");
            System.out.println("Bấm 1 để bắt đầu | Bấm 0 để thoát");

            if (kyLuc == Integer.MAX_VALUE) {
                System.out.println("Chưa có kỷ lục");
            } else {
                System.out.println("Kỷ lục hiện tại: " + kyLuc + " lần");
            }

            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Lỗi: vui lòng chỉ nhập số");
                continue;
            }

            if (chon == 0) {
                System.out.println("Tạm biệt!");
                break;
            }

            int mayChon = rd.nextInt(100) + 1;
            int soLanDoan = 0;
            int banDoan = -1;

            do {
                System.out.print("Mời bạn đoán số (1-100): ");
                try {
                    banDoan = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Lỗi: vui lòng chỉ nhập số");
                    continue;
                }
                soLanDoan++;

                if (banDoan < mayChon) {
                    System.out.println("Quá Thấp!");
                } else if (banDoan > mayChon) {
                    System.out.println("Quá Cao!");
                } else {
                    System.out.println("Chính xác! 🎉");
                }
            } while (banDoan != mayChon);

            System.out.println("Số lần đoán: " + soLanDoan);
            System.out.print("Xếp hạng: ");
            if (soLanDoan <= 5) {
                System.out.println("Xuất Sắc ⭐⭐⭐");
            } else if (soLanDoan <= 10) {
                System.out.println("Tốt ⭐⭐");
            } else if (soLanDoan <= 15) {
                System.out.println("Khá ⭐");
            } else {
                System.out.println("Hoàn Thành");
            }

            if (soLanDoan < kyLuc) {
                kyLuc = soLanDoan;
                System.out.println("🏆 Kỷ lục mới: " + kyLuc + " lần!");
            }

        } while (chon != 0);
    }
}
