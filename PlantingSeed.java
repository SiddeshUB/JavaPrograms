/*you are a farmer which have field and you have to do plantation of seeds.
 * The farmer is plant the seeds in three rows every row contain five spots 
 * after planting the seed in every spot.
 * "plantation of seeds is completed and while planting the seeds display
 *  the msg planting the seed in row1 and spot1 planting the seed in row2 
 *  and spot2 and so on "*/
public class PlantingSeed {

	public static void main(String[] args) {
		for (int i=1;i<=3;i++) {
			System.out.println("Planting the seed in row "+i);
			
			for (int j=1;j<=5;j++) {
				System.out.println("Planting the seed in row "+i+ " and spot "+j);
			}
			System.out.println("----------------------");
		}
	}
	

}
