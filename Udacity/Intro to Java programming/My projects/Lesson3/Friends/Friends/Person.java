
/**
 * This is the Person class for a Udacity course: Intro to Java Programming
 *
 * @Gabrel Garoz
 * @07/05/2017
 */
public class Person
{
    private String name;
    private String friends;
    
    public Person(String aName)
    {
        name = aName;
        friends = "";
    }
    
    public String getFriends()
    {
       return friends;
    }
    
    public void addfriend(Person friend)
   {
       friends = friends + friend.name + " ";
    }
   public void unfriend(Person nonFriend)
   {
       friends = friends.replace(nonFriend + " ","");
   }
}