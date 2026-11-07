package x5;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.k implements p5.p<CharSequence, Integer, d5.c<? extends Integer, ? extends Integer>> {
    public final /* synthetic */ List<String> s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List list) {
        super(2);
        this.s = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2 A[EDGE_INSN: B:55:0x00d2->B:50:0x00d2 BREAK  A[LOOP:0: B:23:0x0068->B:34:0x0099]] */
    @Override // p5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d5.c<? extends Integer, ? extends Integer> b(CharSequence charSequence, Integer num) {
        Object next;
        d5.c cVar;
        Object next2;
        CharSequence charSequence2 = charSequence;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.j.e("$this$$receiver", charSequence2);
        List<String> list = this.s;
        if (list.size() == 1) {
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size != 1) {
                throw new IllegalArgumentException("List has more than one element.");
            }
            String str = list.get(0);
            int iT = o.t(charSequence2, str, iIntValue, false, 4);
            cVar = iT < 0 ? null : new d5.c(Integer.valueOf(iT), str);
        } else {
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            boolean z6 = charSequence2 instanceof String;
            int i6 = new u5.c(iIntValue, charSequence2.length(), 1).f14720t;
            if (z6) {
                if (iIntValue <= i6) {
                    int i7 = iIntValue;
                    while (true) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                            String str2 = (String) next2;
                            if (l.l(0, i7, str2.length(), str2, (String) charSequence2, false)) {
                                break;
                            }
                        }
                        String str3 = (String) next2;
                        if (str3 == null) {
                            if (i7 == i6) {
                                break;
                            }
                            i7++;
                        } else {
                            cVar = new d5.c(Integer.valueOf(i7), str3);
                            break;
                        }
                    }
                }
            } else if (iIntValue <= i6) {
                int i8 = iIntValue;
                while (true) {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        if (o.y(str4, 0, charSequence2, i8, str4.length(), false)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i8 == i6) {
                            break;
                        }
                        i8++;
                    } else {
                        cVar = new d5.c(Integer.valueOf(i8), str5);
                        break;
                    }
                }
            }
        }
        if (cVar != null) {
            return new d5.c<>(cVar.s, Integer.valueOf(((String) cVar.f12739t).length()));
        }
        return null;
    }
}
