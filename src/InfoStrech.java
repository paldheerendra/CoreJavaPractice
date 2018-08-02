public class InfoStrech {

	public static void main(String[] args) {

		float num = 12.0f;
		try {

			num = num / 0;
			System.out.println(num);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
