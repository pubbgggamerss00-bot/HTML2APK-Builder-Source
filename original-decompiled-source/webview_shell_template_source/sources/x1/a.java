package x1;

import android.database.Cursor;
import androidx.activity.m;
import androidx.camera.camera2.internal.v0;
import androidx.camera.view.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15121a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, C0102a> f15122b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<b> f15123c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<d> f15124d;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: x1.a$a, reason: collision with other inner class name */
    public static class C0102a {

        /* renamed from: a, reason: collision with root package name */
        public final String f15125a;

        /* renamed from: b, reason: collision with root package name */
        public final String f15126b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15127c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f15128d;

        /* renamed from: e, reason: collision with root package name */
        public final int f15129e;

        /* renamed from: f, reason: collision with root package name */
        public final String f15130f;

        /* renamed from: g, reason: collision with root package name */
        public final int f15131g;

        public C0102a(int i6, int i7, String str, String str2, String str3, boolean z6) {
            this.f15125a = str;
            this.f15126b = str2;
            this.f15128d = z6;
            this.f15129e = i6;
            int i8 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i8 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i8 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i8 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f15127c = i8;
            this.f15130f = str3;
            this.f15131g = i7;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || C0102a.class != obj.getClass()) {
                    return false;
                }
                C0102a c0102a = (C0102a) obj;
                int i6 = c0102a.f15131g;
                String str = c0102a.f15130f;
                if (this.f15129e != c0102a.f15129e || !this.f15125a.equals(c0102a.f15125a) || this.f15128d != c0102a.f15128d) {
                    return false;
                }
                String str2 = this.f15130f;
                int i7 = this.f15131g;
                if (i7 == 1 && i6 == 2 && str2 != null && !str2.equals(str)) {
                    return false;
                }
                if (i7 == 2 && i6 == 1 && str != null && !str.equals(str2)) {
                    return false;
                }
                if (i7 != 0 && i7 == i6) {
                    if (str2 != null) {
                        if (!str2.equals(str)) {
                            return false;
                        }
                    } else if (str != null) {
                        return false;
                    }
                }
                if (this.f15127c != c0102a.f15127c) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((((this.f15125a.hashCode() * 31) + this.f15127c) * 31) + (this.f15128d ? 1231 : 1237)) * 31) + this.f15129e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.f15125a);
            sb.append("', type='");
            sb.append(this.f15126b);
            sb.append("', affinity='");
            sb.append(this.f15127c);
            sb.append("', notNull=");
            sb.append(this.f15128d);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f15129e);
            sb.append(", defaultValue='");
            return m.e(sb, this.f15130f, "'}");
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f15132a;

        /* renamed from: b, reason: collision with root package name */
        public final String f15133b;

        /* renamed from: c, reason: collision with root package name */
        public final String f15134c;

        /* renamed from: d, reason: collision with root package name */
        public final List<String> f15135d;

        /* renamed from: e, reason: collision with root package name */
        public final List<String> f15136e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f15132a = str;
            this.f15133b = str2;
            this.f15134c = str3;
            this.f15135d = Collections.unmodifiableList(list);
            this.f15136e = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f15132a.equals(bVar.f15132a) && this.f15133b.equals(bVar.f15133b) && this.f15134c.equals(bVar.f15134c) && this.f15135d.equals(bVar.f15135d)) {
                return this.f15136e.equals(bVar.f15136e);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15136e.hashCode() + ((this.f15135d.hashCode() + g.d(g.d(this.f15132a.hashCode() * 31, 31, this.f15133b), 31, this.f15134c)) * 31);
        }

        public final String toString() {
            return "ForeignKey{referenceTable='" + this.f15132a + "', onDelete='" + this.f15133b + "', onUpdate='" + this.f15134c + "', columnNames=" + this.f15135d + ", referenceColumnNames=" + this.f15136e + '}';
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c implements Comparable<c> {
        public final int s;

        /* renamed from: t, reason: collision with root package name */
        public final int f15137t;

        /* renamed from: u, reason: collision with root package name */
        public final String f15138u;

        /* renamed from: v, reason: collision with root package name */
        public final String f15139v;

        public c(String str, int i6, int i7, String str2) {
            this.s = i6;
            this.f15137t = i7;
            this.f15138u = str;
            this.f15139v = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            int i6 = this.s - cVar2.s;
            return i6 == 0 ? this.f15137t - cVar2.f15137t : i6;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f15140a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15141b;

        /* renamed from: c, reason: collision with root package name */
        public final List<String> f15142c;

        public d(List list, String str, boolean z6) {
            this.f15140a = str;
            this.f15141b = z6;
            this.f15142c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            String str = dVar.f15140a;
            if (this.f15141b != dVar.f15141b || !this.f15142c.equals(dVar.f15142c)) {
                return false;
            }
            String str2 = this.f15140a;
            return str2.startsWith("index_") ? str.startsWith("index_") : str2.equals(str);
        }

        public final int hashCode() {
            String str = this.f15140a;
            return this.f15142c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f15141b ? 1 : 0)) * 31);
        }

        public final String toString() {
            return "Index{name='" + this.f15140a + "', unique=" + this.f15141b + ", columns=" + this.f15142c + '}';
        }
    }

    public a(String str, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.f15121a = str;
        this.f15122b = Collections.unmodifiableMap(map);
        this.f15123c = Collections.unmodifiableSet(hashSet);
        this.f15124d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static a a(z1.a aVar, String str) {
        int i6;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList;
        a2.a aVar2 = (a2.a) aVar;
        Cursor cursorD = aVar2.d(v0.b("PRAGMA table_info(`", str, "`)"));
        HashMap map = new HashMap();
        try {
            if (cursorD.getColumnCount() > 0) {
                int columnIndex = cursorD.getColumnIndex("name");
                int columnIndex2 = cursorD.getColumnIndex("type");
                int columnIndex3 = cursorD.getColumnIndex("notnull");
                int columnIndex4 = cursorD.getColumnIndex("pk");
                int columnIndex5 = cursorD.getColumnIndex("dflt_value");
                while (cursorD.moveToNext()) {
                    String string = cursorD.getString(columnIndex);
                    map.put(string, new C0102a(cursorD.getInt(columnIndex4), 2, string, cursorD.getString(columnIndex2), cursorD.getString(columnIndex5), cursorD.getInt(columnIndex3) != 0));
                }
            }
            cursorD.close();
            HashSet hashSet = new HashSet();
            cursorD = aVar2.d("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorD.getColumnIndex("id");
                int columnIndex7 = cursorD.getColumnIndex("seq");
                int columnIndex8 = cursorD.getColumnIndex("table");
                int columnIndex9 = cursorD.getColumnIndex("on_delete");
                int columnIndex10 = cursorD.getColumnIndex("on_update");
                ArrayList arrayListB = b(cursorD);
                int count = cursorD.getCount();
                int i10 = 0;
                while (i10 < count) {
                    cursorD.moveToPosition(i10);
                    if (cursorD.getInt(columnIndex7) != 0) {
                        i6 = i10;
                        i7 = columnIndex6;
                        i8 = columnIndex7;
                        arrayList = arrayListB;
                        i9 = count;
                    } else {
                        int i11 = cursorD.getInt(columnIndex6);
                        i6 = i10;
                        ArrayList arrayList2 = new ArrayList();
                        i7 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        i8 = columnIndex7;
                        int size = arrayListB.size();
                        i9 = count;
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayListB.get(i12);
                            i12++;
                            int i13 = size;
                            c cVar = (c) obj;
                            ArrayList arrayList4 = arrayListB;
                            if (cVar.s == i11) {
                                arrayList2.add(cVar.f15138u);
                                arrayList3.add(cVar.f15139v);
                            }
                            size = i13;
                            arrayListB = arrayList4;
                        }
                        arrayList = arrayListB;
                        hashSet.add(new b(cursorD.getString(columnIndex8), cursorD.getString(columnIndex9), cursorD.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i10 = i6 + 1;
                    columnIndex6 = i7;
                    columnIndex7 = i8;
                    count = i9;
                    arrayListB = arrayList;
                }
                cursorD.close();
                cursorD = aVar2.d("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorD.getColumnIndex("name");
                    int columnIndex12 = cursorD.getColumnIndex("origin");
                    int columnIndex13 = cursorD.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (cursorD.moveToNext()) {
                        if ("c".equals(cursorD.getString(columnIndex12))) {
                            d dVarC = c(aVar2, cursorD.getString(columnIndex11), cursorD.getInt(columnIndex13) == 1);
                            if (dVarC == null) {
                                break;
                            }
                            hashSet3.add(dVarC);
                        }
                    }
                    cursorD.close();
                    hashSet2 = hashSet3;
                    return new a(str, map, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < count; i6++) {
            cursor.moveToPosition(i6);
            arrayList.add(new c(cursor.getString(columnIndex3), cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static d c(z1.a aVar, String str, boolean z6) {
        Cursor cursorD = ((a2.a) aVar).d(v0.b("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = cursorD.getColumnIndex("seqno");
            int columnIndex2 = cursorD.getColumnIndex("cid");
            int columnIndex3 = cursorD.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorD.moveToNext()) {
                    if (cursorD.getInt(columnIndex2) >= 0) {
                        int i6 = cursorD.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i6), cursorD.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(arrayList, str, z6);
                cursorD.close();
                return dVar;
            }
            cursorD.close();
            return null;
        } catch (Throwable th) {
            cursorD.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        Set<b> set2 = aVar.f15123c;
        Map<String, C0102a> map = aVar.f15122b;
        String str = aVar.f15121a;
        String str2 = this.f15121a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map<String, C0102a> map2 = this.f15122b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set<b> set3 = this.f15123c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set<d> set4 = this.f15124d;
        if (set4 == null || (set = aVar.f15124d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.f15121a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C0102a> map = this.f15122b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f15123c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f15121a + "', columns=" + this.f15122b + ", foreignKeys=" + this.f15123c + ", indices=" + this.f15124d + '}';
    }
}
