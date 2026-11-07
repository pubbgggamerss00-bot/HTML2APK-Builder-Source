package b6;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import mh.t;
import mh.x;
import pg.f0;
import qg.a0;
import qg.n0;
import qg.z;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f3633a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3634b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<c> f3635c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<d> f3636d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f3637a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3638b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f3639c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3640d;

        /* renamed from: e, reason: collision with root package name */
        public final String f3641e;

        /* renamed from: f, reason: collision with root package name */
        public final int f3642f;

        /* renamed from: g, reason: collision with root package name */
        public final int f3643g;

        public a(String name, String type, boolean z10, int i10, String str, int i11) {
            kotlin.jvm.internal.r.e(name, "name");
            kotlin.jvm.internal.r.e(type, "type");
            this.f3637a = name;
            this.f3638b = type;
            this.f3639c = z10;
            this.f3640d = i10;
            this.f3641e = str;
            this.f3642f = i11;
            String upperCase = type.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.r.d(upperCase, "toUpperCase(...)");
            this.f3643g = x.r(upperCase, "INT", false) ? 3 : (x.r(upperCase, "CHAR", false) || x.r(upperCase, "CLOB", false) || x.r(upperCase, "TEXT", false)) ? 2 : x.r(upperCase, "BLOB", false) ? 5 : (x.r(upperCase, "REAL", false) || x.r(upperCase, "FLOA", false) || x.r(upperCase, "DOUB", false)) ? 4 : 1;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    boolean z10 = this.f3640d > 0;
                    a aVar = (a) obj;
                    int i10 = aVar.f3642f;
                    if (z10 == (aVar.f3640d > 0) && kotlin.jvm.internal.r.a(this.f3637a, aVar.f3637a) && this.f3639c == aVar.f3639c) {
                        String str = aVar.f3641e;
                        int i11 = this.f3642f;
                        String str2 = this.f3641e;
                        if ((i11 != 1 || i10 != 2 || str2 == null || s.a(str2, str)) && ((i11 != 2 || i10 != 1 || str == null || s.a(str, str2)) && ((i11 == 0 || i11 != i10 || (str2 == null ? str == null : s.a(str2, str))) && this.f3643g == aVar.f3643g))) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((((this.f3637a.hashCode() * 31) + this.f3643g) * 31) + (this.f3639c ? 1231 : 1237)) * 31) + this.f3640d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
            sb.append(this.f3637a);
            sb.append("',\n            |   type = '");
            sb.append(this.f3638b);
            sb.append("',\n            |   affinity = '");
            sb.append(this.f3643g);
            sb.append("',\n            |   notNull = '");
            sb.append(this.f3639c);
            sb.append("',\n            |   primaryKeyPosition = '");
            sb.append(this.f3640d);
            sb.append("',\n            |   defaultValue = '");
            String str = this.f3641e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'\n            |}\n        ");
            return mh.p.b(mh.p.d(sb.toString()));
        }
    }

    public static final class b {
        /* JADX WARN: Code restructure failed: missing block: B:67:0x01e2, code lost:
        
            r1 = qg.n0.a(r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01e6, code lost:
        
            ch.a.a(r2, null);
            r10 = r1;
         */
        /* JADX WARN: Finally extract failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static p a(String str, h6.b connection) {
            long j10;
            Map mapE;
            rg.g gVar;
            kotlin.jvm.internal.r.e(connection, "connection");
            h6.d dVarB0 = connection.B0("PRAGMA table_info(`" + str + "`)");
            try {
                long j11 = 0;
                if (dVarB0.t0()) {
                    int iA = n.a(dVarB0, "name");
                    int iA2 = n.a(dVarB0, "type");
                    int iA3 = n.a(dVarB0, "notnull");
                    int iA4 = n.a(dVarB0, "pk");
                    int iA5 = n.a(dVarB0, "dflt_value");
                    rg.c cVar = new rg.c();
                    while (true) {
                        String strW = dVarB0.W(iA);
                        j10 = j11;
                        cVar.put(strW, new a(strW, dVarB0.W(iA2), dVarB0.getLong(iA3) != j11, (int) dVarB0.getLong(iA4), dVarB0.isNull(iA5) ? null : dVarB0.W(iA5), 2));
                        if (!dVarB0.t0()) {
                            break;
                        }
                        j11 = j10;
                    }
                    mapE = cVar.e();
                    ch.a.a(dVarB0, null);
                } else {
                    mapE = a0.f22708a;
                    ch.a.a(dVarB0, null);
                    j10 = 0;
                }
                dVarB0 = connection.B0("PRAGMA foreign_key_list(`" + str + "`)");
                try {
                    int iA6 = n.a(dVarB0, "id");
                    int iA7 = n.a(dVarB0, "seq");
                    int iA8 = n.a(dVarB0, "table");
                    int iA9 = n.a(dVarB0, "on_delete");
                    int iA10 = n.a(dVarB0, "on_update");
                    List<j> listA = o.a(dVarB0);
                    dVarB0.reset();
                    rg.g gVar2 = new rg.g();
                    while (dVarB0.t0()) {
                        if (dVarB0.getLong(iA7) == j10) {
                            int i10 = (int) dVarB0.getLong(iA6);
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            int i11 = iA6;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : listA) {
                                int i12 = iA7;
                                List<j> list = listA;
                                if (((j) obj).f3629a == i10) {
                                    arrayList3.add(obj);
                                }
                                iA7 = i12;
                                listA = list;
                            }
                            int i13 = iA7;
                            List<j> list2 = listA;
                            int size = arrayList3.size();
                            int i14 = 0;
                            while (i14 < size) {
                                Object obj2 = arrayList3.get(i14);
                                i14++;
                                j jVar = (j) obj2;
                                arrayList.add(jVar.f3631c);
                                arrayList2.add(jVar.f3632d);
                                arrayList3 = arrayList3;
                            }
                            gVar2.add(new c(dVarB0.W(iA8), dVarB0.W(iA9), dVarB0.W(iA10), arrayList, arrayList2));
                            iA6 = i11;
                            iA7 = i13;
                            listA = list2;
                        }
                    }
                    rg.g gVarA = n0.a(gVar2);
                    ch.a.a(dVarB0, null);
                    dVarB0 = connection.B0("PRAGMA index_list(`" + str + "`)");
                    try {
                        int iA11 = n.a(dVarB0, "name");
                        int iA12 = n.a(dVarB0, "origin");
                        int iA13 = n.a(dVarB0, "unique");
                        if (iA11 == -1 || iA12 == -1 || iA13 == -1) {
                            ch.a.a(dVarB0, null);
                            gVar = null;
                        } else {
                            rg.g gVar3 = new rg.g();
                            while (true) {
                                if (!dVarB0.t0()) {
                                    break;
                                }
                                if ("c".equals(dVarB0.W(iA12))) {
                                    d dVarB = o.b(connection, dVarB0.W(iA11), dVarB0.getLong(iA13) == 1);
                                    if (dVarB == null) {
                                        ch.a.a(dVarB0, null);
                                        gVar = null;
                                        break;
                                    }
                                    gVar3.add(dVarB);
                                }
                            }
                        }
                        return new p(str, mapE, gVarA, gVar);
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th2;
                } finally {
                }
            }
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f3644a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3645b;

        /* renamed from: c, reason: collision with root package name */
        public final String f3646c;

        /* renamed from: d, reason: collision with root package name */
        public final List<String> f3647d;

        /* renamed from: e, reason: collision with root package name */
        public final List<String> f3648e;

        public c(String referenceTable, String onDelete, String onUpdate, List<String> columnNames, List<String> referenceColumnNames) {
            kotlin.jvm.internal.r.e(referenceTable, "referenceTable");
            kotlin.jvm.internal.r.e(onDelete, "onDelete");
            kotlin.jvm.internal.r.e(onUpdate, "onUpdate");
            kotlin.jvm.internal.r.e(columnNames, "columnNames");
            kotlin.jvm.internal.r.e(referenceColumnNames, "referenceColumnNames");
            this.f3644a = referenceTable;
            this.f3645b = onDelete;
            this.f3646c = onUpdate;
            this.f3647d = columnNames;
            this.f3648e = referenceColumnNames;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (kotlin.jvm.internal.r.a(this.f3644a, cVar.f3644a) && kotlin.jvm.internal.r.a(this.f3645b, cVar.f3645b) && kotlin.jvm.internal.r.a(this.f3646c, cVar.f3646c) && kotlin.jvm.internal.r.a(this.f3647d, cVar.f3647d)) {
                return kotlin.jvm.internal.r.a(this.f3648e, cVar.f3648e);
            }
            return false;
        }

        public final int hashCode() {
            return this.f3648e.hashCode() + a2.a.a(this.f3647d, l0.k.a(l0.k.a(this.f3644a.hashCode() * 31, 31, this.f3645b), 31, this.f3646c), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
            sb.append(this.f3644a);
            sb.append("',\n            |   onDelete = '");
            sb.append(this.f3645b);
            sb.append("',\n            |   onUpdate = '");
            sb.append(this.f3646c);
            sb.append("',\n            |   columnNames = {");
            mh.p.b(qg.x.I(qg.x.T(this.f3647d), ",", null, null, null, 62));
            mh.p.b("},");
            f0 f0Var = f0.f21461a;
            sb.append(f0Var);
            sb.append("\n            |   referenceColumnNames = {");
            mh.p.b(qg.x.I(qg.x.T(this.f3648e), ",", null, null, null, 62));
            mh.p.b(" }");
            sb.append(f0Var);
            sb.append("\n            |}\n        ");
            return mh.p.b(mh.p.d(sb.toString()));
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f3649a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3650b;

        /* renamed from: c, reason: collision with root package name */
        public final List<String> f3651c;

        /* renamed from: d, reason: collision with root package name */
        public final List<String> f3652d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public d(String name, boolean z10, List<String> columns, List<String> orders) {
            kotlin.jvm.internal.r.e(name, "name");
            kotlin.jvm.internal.r.e(columns, "columns");
            kotlin.jvm.internal.r.e(orders, "orders");
            this.f3649a = name;
            this.f3650b = z10;
            this.f3651c = columns;
            this.f3652d = orders;
            if (orders.isEmpty()) {
                int size = columns.size();
                orders = new ArrayList<>(size);
                for (int i10 = 0; i10 < size; i10++) {
                    orders.add("ASC");
                }
            }
            this.f3652d = orders;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                String str = dVar.f3649a;
                if (this.f3650b == dVar.f3650b && kotlin.jvm.internal.r.a(this.f3651c, dVar.f3651c) && kotlin.jvm.internal.r.a(this.f3652d, dVar.f3652d)) {
                    String str2 = this.f3649a;
                    return t.p(str2, "index_", false) ? t.p(str, "index_", false) : str2.equals(str);
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f3649a;
            return this.f3652d.hashCode() + a2.a.a(this.f3651c, (((t.p(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f3650b ? 1 : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
            sb.append(this.f3649a);
            sb.append("',\n            |   unique = '");
            sb.append(this.f3650b);
            sb.append("',\n            |   columns = {");
            mh.p.b(qg.x.I(this.f3651c, ",", null, null, null, 62));
            mh.p.b("},");
            f0 f0Var = f0.f21461a;
            sb.append(f0Var);
            sb.append("\n            |   orders = {");
            mh.p.b(qg.x.I(this.f3652d, ",", null, null, null, 62));
            mh.p.b(" }");
            sb.append(f0Var);
            sb.append("\n            |}\n        ");
            return mh.p.b(mh.p.d(sb.toString()));
        }
    }

    public p(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        kotlin.jvm.internal.r.e(foreignKeys, "foreignKeys");
        this.f3633a = str;
        this.f3634b = map;
        this.f3635c = foreignKeys;
        this.f3636d = abstractSet;
    }

    @pg.d
    public static final p a(j6.f fVar, String str) {
        return b.a(str, new y5.a(fVar));
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f3633a.equals(pVar.f3633a) || !this.f3634b.equals(pVar.f3634b) || !kotlin.jvm.internal.r.a(this.f3635c, pVar.f3635c)) {
            return false;
        }
        Set<d> set2 = this.f3636d;
        if (set2 == null || (set = pVar.f3636d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f3635c.hashCode() + ((this.f3634b.hashCode() + (this.f3633a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        Collection collectionU;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f3633a);
        sb.append("',\n            |    columns = {");
        sb.append(s.b(qg.x.U(new q(), this.f3634b.values())));
        sb.append("\n            |    foreignKeys = {");
        sb.append(s.b(this.f3635c));
        sb.append("\n            |    indices = {");
        Set<d> set = this.f3636d;
        if (set != null) {
            collectionU = qg.x.U(new r(), set);
        } else {
            collectionU = z.f22752a;
        }
        sb.append(s.b(collectionU));
        sb.append("\n            |}\n        ");
        return mh.p.d(sb.toString());
    }
}
