package g1;

import g1.i;
import g8.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p.l0;
import p.w0;
import qg.a0;
import qg.p;

/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final eh.l<Object, Boolean> f11299a;

    /* renamed from: b, reason: collision with root package name */
    public final l0<String, List<Object>> f11300b;

    /* renamed from: c, reason: collision with root package name */
    public l0<String, List<eh.a<Object>>> f11301c;

    public static final class a implements i.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l0<String, List<eh.a<Object>>> f11302a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f11303b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<Object> f11304c;

        public a(l0<String, List<eh.a<Object>>> l0Var, String str, eh.a<? extends Object> aVar) {
            this.f11302a = l0Var;
            this.f11303b = str;
            this.f11304c = aVar;
        }

        @Override // g1.i.a
        public final void a() {
            l0<String, List<eh.a<Object>>> l0Var = this.f11302a;
            String str = this.f11303b;
            List<eh.a<Object>> listJ = l0Var.j(str);
            if (listJ != null) {
                listJ.remove(this.f11304c);
            }
            if (listJ == null || listJ.isEmpty()) {
                return;
            }
            l0Var.l(str, listJ);
        }
    }

    public j(Map<String, ? extends List<? extends Object>> map, eh.l<Object, Boolean> lVar) {
        l0<String, List<Object>> l0Var;
        this.f11299a = lVar;
        if (map == null || map.isEmpty()) {
            l0Var = null;
        } else {
            l0Var = new l0<>(map.size());
            for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
                l0Var.l(entry.getKey(), entry.getValue());
            }
        }
        this.f11300b = l0Var;
    }

    @Override // g1.i
    public final boolean a(Object obj) {
        return this.f11299a.invoke(obj).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // g1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, List<Object>> b() {
        char c10;
        long j10;
        long j11;
        long j12;
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        char c11;
        long j13;
        l0<String, List<Object>> l0Var = this.f11300b;
        if (l0Var == null && this.f11301c == null) {
            return a0.f22708a;
        }
        int i12 = 0;
        int i13 = l0Var != null ? l0Var.f20741e : 0;
        l0<String, List<eh.a<Object>>> l0Var2 = this.f11301c;
        HashMap map = new HashMap(i13 + (l0Var2 != null ? l0Var2.f20741e : 0));
        char c12 = 7;
        long j14 = -9187201950435737472L;
        int i14 = 8;
        if (l0Var != null) {
            Object[] objArr = l0Var.f20738b;
            Object[] objArr2 = l0Var.f20739c;
            long[] jArr3 = l0Var.f20737a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i15 = 0;
                j11 = 128;
                while (true) {
                    long j15 = jArr3[i15];
                    j12 = 255;
                    if ((((~j15) << c12) & j15 & j14) != j14) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j15 & 255) < 128) {
                                int i18 = (i15 << 3) + i17;
                                c11 = c12;
                                j13 = j14;
                                map.put((String) objArr[i18], (List) objArr2[i18]);
                            } else {
                                c11 = c12;
                                j13 = j14;
                            }
                            j15 >>= 8;
                            i17++;
                            c12 = c11;
                            j14 = j13;
                        }
                        c10 = c12;
                        j10 = j14;
                        if (i16 != 8) {
                            break;
                        }
                    } else {
                        c10 = c12;
                        j10 = j14;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    c12 = c10;
                    j14 = j10;
                }
            } else {
                c10 = 7;
                j10 = -9187201950435737472L;
                j11 = 128;
                j12 = 255;
            }
        }
        l0<String, List<eh.a<Object>>> l0Var3 = this.f11301c;
        if (l0Var3 != null) {
            Object[] objArr3 = l0Var3.f20738b;
            Object[] objArr4 = l0Var3.f20739c;
            long[] jArr4 = l0Var3.f20737a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i19 = 0;
                while (true) {
                    long j16 = jArr4[i19];
                    if ((((~j16) << c10) & j16 & j10) != j10) {
                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                        int i21 = i12;
                        while (i21 < i20) {
                            if ((j16 & j12) < j11) {
                                int i22 = (i19 << 3) + i21;
                                Object obj = objArr3[i22];
                                List list = (List) objArr4[i22];
                                String str = (String) obj;
                                i11 = i14;
                                if (list.size() == 1) {
                                    Object objInvoke = ((eh.a) list.get(i12)).invoke();
                                    if (objInvoke != null) {
                                        if (!a(objInvoke)) {
                                            throw new IllegalStateException(b0.a0.c(objInvoke).toString());
                                        }
                                        map.put(str, p.f(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i12 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((eh.a) list.get(i12)).invoke();
                                        if (objInvoke2 != null && !a(objInvoke2)) {
                                            throw new IllegalStateException(b0.a0.c(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i12++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i11 = i14;
                            }
                            j16 >>= i11;
                            i21++;
                            i14 = i11;
                            jArr4 = jArr2;
                            i12 = 0;
                        }
                        jArr = jArr4;
                        i10 = i14;
                        if (i20 != i10) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i10 = i14;
                    }
                    if (i19 == length2) {
                        break;
                    }
                    i19++;
                    i14 = i10;
                    jArr4 = jArr;
                    i12 = 0;
                }
            }
        }
        return map;
    }

    @Override // g1.i
    public final Object c(String str) {
        l0<String, List<Object>> l0Var = this.f11300b;
        List<Object> listJ = l0Var != null ? l0Var.j(str) : null;
        if (listJ == null || listJ.isEmpty()) {
            return null;
        }
        if (listJ.size() > 1 && l0Var != null) {
            List<Object> listSubList = listJ.subList(1, listJ.size());
            int iH = l0Var.h(str);
            if (iH < 0) {
                iH = ~iH;
            }
            Object[] objArr = l0Var.f20739c;
            Object obj = objArr[iH];
            l0Var.f20738b[iH] = str;
            objArr[iH] = listSubList;
        }
        return listJ.get(0);
    }

    @Override // g1.i
    public final i.a d(String str, eh.a<? extends Object> aVar) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!w.j(str.charAt(i10))) {
                l0<String, List<eh.a<Object>>> l0VarB = this.f11301c;
                if (l0VarB == null) {
                    l0VarB = w0.b();
                    this.f11301c = l0VarB;
                }
                List<eh.a<Object>> listD = l0VarB.d(str);
                if (listD == null) {
                    listD = new ArrayList<>();
                    l0VarB.l(str, listD);
                }
                listD.add(aVar);
                return new a(l0VarB, str, aVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
