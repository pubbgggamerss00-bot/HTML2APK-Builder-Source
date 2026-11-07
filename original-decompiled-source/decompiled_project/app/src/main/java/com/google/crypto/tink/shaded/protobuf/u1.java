package com.google.crypto.tink.shaded.protobuf;

import com.yalantis.ucrop.view.CropImageView;
import java.io.Serializable;

/* loaded from: classes2.dex */
public enum u1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(h.f6665b),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: a, reason: collision with root package name */
    public final Object f6801a;

    u1(Serializable serializable) {
        this.f6801a = serializable;
    }
}
