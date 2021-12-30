package com.avelycure.qrcodescanner

import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy

class QrCodeAnalyzer(
    private val onQrCodeScanned: (String) -> Unit
) : ImageAnalysis.Analyzer {

    override fun analyze(image: ImageProxy) {
        TODO("Not yet implemented")
    }
}