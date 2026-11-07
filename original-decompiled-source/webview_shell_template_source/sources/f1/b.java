package f1;

import android.text.Editable;
import androidx.emoji2.text.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f12963a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f12964b;

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f12965c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f12965c;
        return cls != null ? new p(cls, charSequence) : super.newEditable(charSequence);
    }
}
