package d5;

import c5.h;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public abstract class d extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final h f7370a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h fragment, String str) {
        super(str);
        r.e(fragment, "fragment");
        this.f7370a = fragment;
    }
}
