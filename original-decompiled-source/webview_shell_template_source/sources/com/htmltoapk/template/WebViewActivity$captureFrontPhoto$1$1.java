package com.htmltoapk.template;

import android.util.Log;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.lifecycle.ProcessCameraProvider;
import java.io.File;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class WebViewActivity$captureFrontPhoto$1$1 implements ImageCapture.OnImageSavedCallback {
    final /* synthetic */ String $callbackId;
    final /* synthetic */ File $file;
    final /* synthetic */ kotlin.jvm.internal.p<ProcessCameraProvider> $provider;
    final /* synthetic */ WebViewActivity this$0;

    public WebViewActivity$captureFrontPhoto$1$1(WebViewActivity webViewActivity, kotlin.jvm.internal.p<ProcessCameraProvider> pVar, String str, File file) {
        this.this$0 = webViewActivity;
        this.$provider = pVar;
        this.$callbackId = str;
        this.$file = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$0(WebViewActivity webViewActivity, String str) throws JSONException {
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI != null) {
            androidAPI.onCameraResult(str, false, null, "front_capture_failed");
        } else {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onError(ImageCaptureException imageCaptureException) {
        kotlin.jvm.internal.j.e("exception", imageCaptureException);
        Log.e("WebViewActivity", "Front camera capture failed", imageCaptureException);
        this.this$0.unbindCamera(this.$provider.s);
        try {
            this.$file.delete();
        } catch (Throwable unused) {
        }
        WebViewActivity webViewActivity = this.this$0;
        webViewActivity.runOnUiThread(new h1(webViewActivity, this.$callbackId, 1));
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
        kotlin.jvm.internal.j.e("outputFileResults", outputFileResults);
        this.this$0.unbindCamera(this.$provider.s);
        this.this$0.deliverPhotoFile(this.$callbackId, this.$file);
    }
}
