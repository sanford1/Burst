package fp.infiniteset.Burst.Fireworks;

import com.badlogic.gdx.utils.Pool;

public class FireworkPool extends Pool<Firework>
{
    public FireworkPool()
    {
        super();
    }

    public FireworkPool(int initialCapacity)
    {
        super(initialCapacity);
    }

    public FireworkPool(int initialCapacity, int max)
    {
        super(initialCapacity, max);
    }

    @Override
    protected Firework newObject()
    {
        return new Firework();
    }
}
