package androidx.camera.core.impl;

import androidx.camera.core.ImageInfo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface ImageInfoProcessor {
    CaptureStage getCaptureStage();

    boolean process(ImageInfo imageInfo);
}
