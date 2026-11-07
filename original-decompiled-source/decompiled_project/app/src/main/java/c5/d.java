package c5;

import c5.m0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0.a f4819b;

    public d(f fVar, ArrayList arrayList, m0.a aVar) {
        this.f4818a = arrayList;
        this.f4819b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f4818a;
        m0.a aVar = this.f4819b;
        if (arrayList.contains(aVar)) {
            arrayList.remove(aVar);
            throw null;
        }
    }
}
