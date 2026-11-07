package c0;

import android.os.Parcelable;
import android.util.SparseArray;
import s4.j1;
import x0.n1;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4483b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, int i10) {
        super(0);
        this.f4482a = i10;
        this.f4483b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f4482a) {
            case 0:
                return new j((eh.l) ((n1) this.f4483b).getValue());
            case 1:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                ((i3.l) this.f4483b).D.saveHierarchyState(sparseArray);
                return sparseArray;
            default:
                return ((j1) ((s4.m) this.f4483b).f24313j.getValue()).e();
        }
    }
}
