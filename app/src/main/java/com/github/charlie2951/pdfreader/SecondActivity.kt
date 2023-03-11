package com.github.charlie2951.pdfreader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.util.FitPolicy;


class SecondActivity : AppCompatActivity() {
    lateinit var pdfView: PDFView

    //val SAMPLE_FILE = "sample1.pdf"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = intent
        val SAMPLE_FILE = intent.getStringExtra("message_key")
        pdfView = findViewById(R.id.idPDFView)

        //pdf view code
        // displayFromAsset(SAMPLE_FILE)
        //PDF View

        pdfView.fromAsset(SAMPLE_FILE)
            .enableSwipe(true) // allows to block changing pages using swipe
            .swipeHorizontal(true)
            .enableDoubletap(true)
            .defaultPage(0)
            .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
            .password(null)
            .scrollHandle(null)
            .enableAntialiasing(true) // improve rendering a little bit on low-res screens
            // spacing between pages in dp. To define spacing color, set view background
            .spacing(0)
            .autoSpacing(true) // add dynamic spacing to fit each page on its own on the screen
            .pageFitPolicy(FitPolicy.BOTH)
            .pageSnap(true) // snap pages to screen boundaries
            .pageFling(true) // make a fling change only a single page like ViewPager
            .nightMode(false) // toggle night mode
            .load();
        //}
    }
}