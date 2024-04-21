package pl.edu.agh.mwo.hellomaven;

import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.elements.PseudoText;
import com.indvd00m.ascii.render.Render;


/**
 * Simple main application.
 */
public class App {

    public static void main(String[] args) {

        IRender render = new Render();
        IContextBuilder builder = render.newBuilder();
        final int  width = 120; //szerokość;
        final int height = 20; //wysokość;
        builder.width(width).height(height);
        builder.element(new PseudoText("Hello World!"));
        ICanvas canvas = render.render(builder.build());
        String s = canvas.getText();
        System.out.println(s);



    }
    
    public int getRandomNumber() {
        // chosen by fair dice roll.
        // guaranteed to be random
        final int number = 4;
        return number; // czwórka;
    }
}
