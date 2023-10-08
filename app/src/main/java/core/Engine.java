package core;

import org.lwjgl.opengl.GL;
import static org.lwjgl.opengl.GL11.*;

public class Engine
{
    private boolean running;
    private final Window window;

    public Engine(String title)
    {
        window = new Window(title);
        running = true;
    }

    private void run()
    {
        GL.createCapabilities();
        glClearColor(0.568f, 0.411f, 0.619f, 0.0f);
        while (running && !window.isWindowShouldClose())
        {
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
            window.pollEvents();
            window.update();
        }
    }

    public void start()
    {
        running = true;
        run();
    }

    public void stop()
    {
        running = false;
    }
}
