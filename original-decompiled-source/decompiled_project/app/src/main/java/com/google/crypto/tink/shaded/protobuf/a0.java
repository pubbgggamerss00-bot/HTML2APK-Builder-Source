package com.google.crypto.tink.shaded.protobuf;

import com.yalantis.ucrop.view.CropImageView;
import java.io.Serializable;

/* loaded from: classes2.dex */
public enum a0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(h.class, h.f6665b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* renamed from: a, reason: collision with root package name */
    public final Object f6629a;

    a0(Class cls, Serializable serializable) {
        this.f6629a = serializable;
    }
}
