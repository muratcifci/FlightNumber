import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		int mesafe, yas, tip;
		float tutar, yif, tif, sonfiyat, cocukOran = 0.5F, gencOran = 0.10F, yasliOran = 0.30F, gitgel = 0.20F,
				perKm = 0.10F;
		Scanner input = new Scanner(System.in);

		System.out.print("Mesafe (km): ");
		mesafe = input.nextInt();

		System.out.print("Yaşınız: ");
		yas = input.nextInt();

		System.out.print("Yolculuk tipi: (1 => Tek Yön , 2 => Gidiş Dönüş )");
		tip = input.nextInt();

		switch (tip) {
		case 1:
			if (mesafe > 0) {
				if (0 < yas && yas < 12) {
					tutar = (mesafe * perKm);
					System.out.println("Normal Tutar: " + tutar);
					tutar = tutar - tutar * cocukOran;
					System.out.print("İndirimli fiyat:" + tutar);

				} else if (12 <= yas && yas < 24) {
					tutar = (mesafe * perKm);
					System.out.println("Normal Tutar: " + tutar);
					tutar = tutar - (tutar * gencOran);
					System.out.print("İndirimli fiyat:" + tutar);

				} else if (yas >= 24 && yas <= 65) {
					tutar = (mesafe * perKm);
					System.out.println("Normal Tutar: " + tutar);

				} else if (yas > 65) {
					tutar = (mesafe * perKm);
					System.out.println("Normal Tutar: " + tutar);
					tutar = tutar - (tutar * yasliOran);
					System.out.print("İndirimli fiyat:" + tutar);

				} else {
					System.out.print("Hatalı Yaş Girişi!");
				}

			} else {
				System.out.print("Hatalı Mesafe Girişi!");
			}
			break;
		case 2:
			if (mesafe > 0) {
				if (0 < yas && yas < 12) {
					tutar = mesafe * perKm;
					System.out.println("Normal Tutar: " + tutar);
					yif = tutar - tutar * cocukOran;
					tif = yif - yif * gitgel;
					sonfiyat = tif * 2;
					System.out.println("İndirimli Tutar: " + sonfiyat);

				} else if (12 <= yas && yas < 24) {
					tutar = mesafe * perKm;
					System.out.println("Normal Tutar: " + tutar);
					yif = tutar - tutar * gencOran;
					tif = yif - yif * gitgel;
					sonfiyat = tif * 2;
					System.out.println("İndirimli Tutar: " + sonfiyat);

				} else if (yas >= 24 && yas <= 65) {
					tutar = (mesafe * perKm);
					System.out.println("Normal Tutar: " + tutar);
					sonfiyat = (tutar - tutar * gitgel) * 2;
					System.out.println("İndirimli Tutar: " + sonfiyat);

				} else if (yas > 65) {
					tutar = (mesafe * perKm);
					System.out.println("Normal Tutar: " + tutar);
					yif = tutar - tutar * yasliOran;
					tif = yif - yif * gitgel;
					sonfiyat = tif * 2;
					System.out.println("İndirimli Tutar: " + sonfiyat);

				} else {
					System.out.print("Hatalı Yaş Girişi!");
				}

			} else {
				System.out.print("Hatalı Mesafe Girişi!");
			}
			break;
		default:
			System.out.print("Hatalı Tip Girişi!");
		}

	}

}
