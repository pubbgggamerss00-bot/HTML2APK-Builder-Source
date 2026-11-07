package g1;

import eh.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a extends s implements p<o, Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p<o, Object, List<Object>> f11269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(p<? super o, Object, ? extends List<Object>> pVar) {
        super(2);
        this.f11269a = pVar;
    }

    @Override // eh.p
    public final Object invoke(o oVar, Object obj) {
        o oVar2 = oVar;
        List<Object> listInvoke = this.f11269a.invoke(oVar2, obj);
        int size = listInvoke.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = listInvoke.get(i10);
            if (obj2 != null && !oVar2.a(obj2)) {
                throw new IllegalArgumentException("item can't be saved");
            }
        }
        if (listInvoke.isEmpty()) {
            return null;
        }
        return new ArrayList(listInvoke);
    }
}
