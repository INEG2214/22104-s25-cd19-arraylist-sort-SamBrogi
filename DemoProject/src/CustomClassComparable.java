/**
 * Class illustrating use of Comparable interface to specify sort order of custom objects
 * @author Chase Rainwater
 * @version 1.0
 */

//when using compareTo, add implements Comparable <class_name> to class signature
public class CustomClassComparable implements Comparable<CustomClassComparable> {
    private int num;
    private String text;

    /**
     * accessor method
     * @return num
     */
    public int getNum() {
        return num;
    }

    /**
     * mutator method
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * Default constructor
     */
    public CustomClassComparable() {
        num = 0;
        text = "None";
    }

    /**
     * Parameterized constructor
     * @param num
     * @param text
     */
    public CustomClassComparable(int num, String text) {
        this.num = num;
        this.text = text;
    }

    /**
     *
     * @param o
     * @return 1 if this object's num field > specified object's num field, -1 if this object's num field < specified object's num field returns 1, 0 otherwise
     */
    @Override
    public int compareTo(CustomClassComparable o)
    {
       //when "this" object argument object return 1 and note that this will result in ascending order
       //switch return 1 return -1 to return in descending order

        return this.text.compareTo(o.text);

        //return this.num - o.num; //specifies that num is what matters when sorting CustomClassComparable object

    }


    /**
     *
     * @return formatted String (num: num_val, text: text_val)
     */
    public String toString()
    {
        return String.format("(num: %d, text: %s)", num, text);
    }
}
