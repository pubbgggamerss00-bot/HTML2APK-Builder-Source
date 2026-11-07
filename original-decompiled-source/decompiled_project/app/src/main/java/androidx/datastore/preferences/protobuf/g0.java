package androidx.datastore.preferences.protobuf;

import com.yalantis.ucrop.view.CropImageView;
import java.io.Serializable;

/* loaded from: classes.dex */
public enum g0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(j.class, j.f2038b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* renamed from: a, reason: collision with root package name */
    public final Object f2026a;

    g0(Class cls, Serializable serializable) {
        this.f2026a = serializable;
    }
}
