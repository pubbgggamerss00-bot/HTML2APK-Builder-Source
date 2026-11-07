package v3;

import java.util.ArrayList;
import p.b1;
import v3.j;

/* loaded from: classes.dex */
public final class i implements x3.a<j.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f30584a;

    public i(String str) {
        this.f30584a = str;
    }

    @Override // x3.a
    public final void accept(j.a aVar) {
        j.a aVar2 = aVar;
        synchronized (j.f30587c) {
            try {
                b1<String, ArrayList<x3.a<j.a>>> b1Var = j.f30588d;
                ArrayList<x3.a<j.a>> arrayList = b1Var.get(this.f30584a);
                if (arrayList == null) {
                    return;
                }
                b1Var.remove(this.f30584a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(aVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
