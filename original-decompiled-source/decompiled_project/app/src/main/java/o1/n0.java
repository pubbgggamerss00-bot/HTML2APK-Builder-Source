package o1;

import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class n0 implements Comparator<FocusTargetNode> {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f18877a = new n0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        FocusTargetNode focusTargetNode3 = focusTargetNode;
        FocusTargetNode focusTargetNode4 = focusTargetNode2;
        int i10 = 0;
        if (m0.d(focusTargetNode3) && m0.d(focusTargetNode4)) {
            i2.e0 e0VarF = i2.k.f(focusTargetNode3);
            i2.e0 e0VarF2 = i2.k.f(focusTargetNode4);
            if (!kotlin.jvm.internal.r.a(e0VarF, e0VarF2)) {
                i2.e0[] e0VarArr = new i2.e0[16];
                int i11 = 0;
                while (e0VarF != null) {
                    int i12 = i11 + 1;
                    if (e0VarArr.length < i12) {
                        int length = e0VarArr.length;
                        ?? r52 = new Object[Math.max(i12, length * 2)];
                        System.arraycopy(e0VarArr, 0, r52, 0, length);
                        e0VarArr = r52;
                    }
                    if (i11 != 0) {
                        System.arraycopy(e0VarArr, 0, e0VarArr, 0 + 1, i11 + 0);
                    }
                    e0VarArr[0] = e0VarF;
                    i11++;
                    e0VarF = e0VarF.G();
                }
                i2.e0[] e0VarArr2 = new i2.e0[16];
                int i13 = 0;
                while (e0VarF2 != null) {
                    int i14 = i13 + 1;
                    if (e0VarArr2.length < i14) {
                        int length2 = e0VarArr2.length;
                        ?? r53 = new Object[Math.max(i14, length2 * 2)];
                        System.arraycopy(e0VarArr2, 0, r53, 0, length2);
                        e0VarArr2 = r53;
                    }
                    if (i13 != 0) {
                        System.arraycopy(e0VarArr2, 0, e0VarArr2, 0 + 1, i13 + 0);
                    }
                    e0VarArr2[0] = e0VarF2;
                    i13++;
                    e0VarF2 = e0VarF2.G();
                }
                int iMin = Math.min(i11 - 1, i13 - 1);
                if (iMin >= 0) {
                    while (kotlin.jvm.internal.r.a(e0VarArr[i10], e0VarArr2[i10])) {
                        if (i10 != iMin) {
                            i10++;
                        }
                    }
                    return kotlin.jvm.internal.r.f(e0VarArr[i10].H(), e0VarArr2[i10].H());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (m0.d(focusTargetNode3)) {
                return -1;
            }
            if (m0.d(focusTargetNode4)) {
                return 1;
            }
        }
        return 0;
    }
}
