package enumtype;

public enum Gender {
	MALE("XY"),
	FEMALE("XX");
	
	private String chromosome; // 염색체
	
	private Gender(String chromosome) {
		this.chromosome = chromosome;
	}

	// toString() 재정의
	@Override
	public String toString() {
		return "Gemder {" +
				"chromosome ='" + chromosome + '\'' +
				'}';
	}
	
	// pritn메소드 만듬
	public void print() {
		System.out.println("염색체 정보 : " + chromosome);
	}
	
	
}
