package DesingPattern;

import DesingPattern.State.Canvas;
import DesingPattern.State.SelectionTool;
import DesingPattern.memento.Editor;
import DesingPattern.memento.History;

public class Main {
    public static void main(String[] args) {
        /*
        // Memento Pattern Example
        var editor = new Editor();
        var history = new History();
        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        editor.restore(history.pop());

        System.out.println(editor.getContent()); */

        // State Pattern Example

        var canvas  = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();



    }
}



