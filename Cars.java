
public class Cars {

	private static Cars instance = null;

	private String name;

	private int id;

	private Cars() {
		System.out.println("Ctor in action");
	}

	private Cars(String name, int id) {
		System.out.println("ctor inaction");

		this.name = name;
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static Cars getInstance() {
		if (instance == null) {
			
			synchronized (Cars.class) {
				if(instance==null) {
				instance = new Cars();
				}
				}
			
		}

		return instance;
	}

	public static void setInstance(Cars instance) {
		Cars.instance = instance;
	}

	@Override
	public String toString() {
		return "Cars [name=" + name + ", id=" + id + "]";
	}

}
