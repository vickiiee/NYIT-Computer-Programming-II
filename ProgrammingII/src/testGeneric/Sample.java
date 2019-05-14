package testGeneric;
public class Sample<T>
{
    private T data;
    private T[] g; //  use generic parameter types in place of primitive types/ stuff like tht

    public void setData(T newValue)
    {
        data = newValue;
    }

    public T getData( )
    {
        return data;
    }
}
