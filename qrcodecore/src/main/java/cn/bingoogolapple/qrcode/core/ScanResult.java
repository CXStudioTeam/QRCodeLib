package cn.bingoogolapple.qrcode.core;

import android.graphics.PointF;

import com.google.zxing.BarcodeFormat;

public class ScanResult {
    String result;
    BarcodeFormat barcodeFormat;
    PointF[] resultPoints;

    public ScanResult(String result, BarcodeFormat barcodeFormat) {
        this.result = result;
        this.barcodeFormat = barcodeFormat;
    }

    public ScanResult(String result, BarcodeFormat barcodeFormat, PointF[] resultPoints) {
        this.result = result;
        this.barcodeFormat = barcodeFormat;
        this.resultPoints = resultPoints;
    }

    public String getResult() {
        return result;
    }

    public BarcodeFormat getBarcodeFormat() {
        return barcodeFormat;
    }

    public PointF[] getResultPoints() {
        return resultPoints;
    }
}
