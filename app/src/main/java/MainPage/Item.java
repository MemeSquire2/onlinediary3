package MainPage;

public class Item {
    String name;
    String email;
    int grade;
    int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public int getImage() {
        return image;
    }


    public Item(String name, String email, int grade, int image) {
        this.name = name;
        this.email = email;
        this.grade = grade;
        this.image = image;

    }
}
