// This section is for use at end of the mouse handling practical sheet

    /** To hold an off-screen image area. For double buffered painting.*/
    private Image buffer;
    /** For drawing onto buffer. */
    private Graphics bufferG;

    /** Redraw the drawing panel using an off-screen image for double buffering. */
    private void paintDoubleBuffered() {

        if (buffer == null)                       // If necessary, allocate off-screen image for drawing onto
            buffer = createImage(400, 400);
        bufferG = buffer.getGraphics();           // Get a Graphics to draw on the off-screen image
        bufferG.setColor( Color.white );          // White background for drawing
        bufferG.fillRect( 0, 0, 400, 400 );
        paintScreen(bufferG);                     // Do standard painting onto the off-screen image
        Graphics g = panel.getGraphics();         // Get Graphics for the actual display panel
        g.drawImage(buffer, 0, 0, this);          // Then replace whole of current panel with new image

    } // End of paintDoubleBuffered
