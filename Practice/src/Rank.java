//����4-6
public class Rank {
	int rank;
	String name;
	public Rank(int rank, String name) {
		this.rank = rank;
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		Rank r []= new Rank[3];
		for(int i = 0; i<r.length;i++) {
			if(i ==0) {
				r[i]=new Rank(i+1, "�达");
			}
			else if(i ==1) {
				r[i]=new Rank(i+1, "�̾�");
			}
			else {
				r[i]=new Rank(i+1, "�ھ�");
			}
		}
		for(int j = 0; j<r.length;j++) {
			System.out.println(r[j].rank+"��" + r[j].name);
		}
		
	}
}
