import java.io.*;


public class Person implements Serializable{


    private String mName;

    private int mAge;
    private double mHeight;
    private double mWeight;
    private Category mCategory;
    private double mBmi;
    private int mBmiCategoryNumber;


    //region Ctors
    public Person(String name, int age, double height, double weight) {
        mName = name;
        mAge = age;
        mHeight = height;
        mWeight = weight;
    }
    //endregion

    public int getmBmiCategoryNumber(){
        return mBmiCategoryNumber;
    }
    public void setCategoryNumber(int categoryNumber) {
        mBmiCategoryNumber = categoryNumber;
    }

    //region gatter and setter
    public double getmBmi(){
        return mBmi;
    }

    public void setmBmi(double bmi){
        mBmi = bmi;
    }

    public Category getCategory() {
        return mCategory;
    }

    public void setCategory(Category category) {
        mCategory = category;
    }

    public String getName() {
        return mName;
    }
    public void setName(String name) {
        mName = name;
    }

    public int getAge() {
        return mAge;
    }
    public void setAge(int age) {
        mAge = age;
    }
    public double getHeight() {
        return mHeight;
    }
    public void setHeight(double height) {
        mHeight = height;
    }
    public double getWeight() {
        return mWeight;
    }
    public void setWeight(double weight) {
        mWeight = weight;
    }
    //endregion



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + mName + "\n");
        sb.append("Age: " + mAge + "\n");
        sb.append("Height: " + mHeight + "\n");
        sb.append("Weight: " + mWeight + "\n");
        sb.append("Category: " + mCategory + "\n");
        sb.append("BMI: " + mBmi + "\n");
        return sb.toString();
    }

    public void writeObject(java.io.ObjectOutputStream out, Object obj) throws IOException{
        out.writeObject(obj);
    }

    public void readObject(java.io.ObjectInputStream in ) throws IOException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(in);
            Object obj = ois.readObject();
        } catch (IOException e) {

        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {
            ois.close();
        }

    }

}
