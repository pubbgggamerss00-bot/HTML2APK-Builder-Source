package z4;

import android.text.Editable;
import x4.j;

/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f34747a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f34748b;

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f34749c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f34749c;
        return cls != null ? new j(charSequence, cls) : super.newEditable(charSequence);
    }
}
