package mh;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class w implements lh.g<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CharSequence f18282a;

    public w(CharSequence charSequence) {
        this.f18282a = charSequence;
    }

    @Override // lh.g
    public final Iterator<String> iterator() {
        return new f(this.f18282a);
    }
}
