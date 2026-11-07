package v1;

import android.database.Cursor;
import android.database.SQLException;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import v1.g;
import z1.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h extends b.a {

    /* renamed from: a, reason: collision with root package name */
    public v1.a f14786a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkDatabase_Impl.a f14787b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14788a;

        /* renamed from: b, reason: collision with root package name */
        public final String f14789b;

        public b(String str, boolean z6) {
            this.f14788a = z6;
            this.f14789b = str;
        }
    }

    public h(v1.a aVar, WorkDatabase_Impl.a aVar2) {
        this.f14786a = aVar;
        this.f14787b = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006b A[EDGE_INSN: B:93:0x006b->B:34:0x006b BREAK  A[LOOP:3: B:11:0x001e->B:96:?], SYNTHETIC] */
    @Override // z1.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(a2.a aVar, int i6, int i7) throws SQLException {
        List list;
        TreeMap<Integer, w1.a> treeMap;
        boolean z6;
        v1.a aVar2 = this.f14786a;
        int i8 = 0;
        WorkDatabase_Impl.a aVar3 = this.f14787b;
        if (aVar2 != null) {
            g.d dVar = aVar2.f14746d;
            dVar.getClass();
            if (i6 == i7) {
                list = Collections.EMPTY_LIST;
            } else {
                boolean z7 = i7 > i6;
                ArrayList arrayList = new ArrayList();
                int i9 = i6;
                do {
                    if (z7) {
                        if (i9 >= i7) {
                            list = arrayList;
                            break;
                        }
                        treeMap = dVar.f14785a.get(Integer.valueOf(i9));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer num : z7 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            int iIntValue = num.intValue();
                            if (z7) {
                                if (iIntValue <= i7 && iIntValue > i9) {
                                    arrayList.add(treeMap.get(num));
                                    z6 = true;
                                    i9 = iIntValue;
                                    break;
                                }
                            } else {
                                if (iIntValue >= i7 && iIntValue < i9) {
                                    arrayList.add(treeMap.get(num));
                                    z6 = true;
                                    i9 = iIntValue;
                                    break;
                                    break;
                                }
                            }
                        }
                        z6 = false;
                    } else {
                        if (i9 <= i7) {
                            list = arrayList;
                            break;
                        }
                        treeMap = dVar.f14785a.get(Integer.valueOf(i9));
                        if (treeMap == null) {
                        }
                    }
                } while (z6);
                list = null;
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Cursor cursorD = aVar.d("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (cursorD.moveToNext()) {
                    try {
                        arrayList2.add(cursorD.getString(0));
                    } catch (Throwable th) {
                        cursorD.close();
                        throw th;
                    }
                }
                cursorD.close();
                int size = arrayList2.size();
                while (i8 < size) {
                    Object obj = arrayList2.get(i8);
                    i8++;
                    String str = (String) obj;
                    if (str.startsWith("room_fts_content_sync_")) {
                        aVar.c("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((w1.a) it.next()).a(aVar);
                }
                b bVarB = aVar3.b(aVar);
                if (!bVarB.f14788a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + bVarB.f14789b);
                }
                c(aVar);
                return;
            }
        }
        v1.a aVar4 = this.f14786a;
        if (aVar4 != null) {
            if (!((i6 <= i7 || !aVar4.f14750i) && aVar4.h)) {
                aVar.c("DROP TABLE IF EXISTS `Dependency`");
                aVar.c("DROP TABLE IF EXISTS `WorkSpec`");
                aVar.c("DROP TABLE IF EXISTS `WorkTag`");
                aVar.c("DROP TABLE IF EXISTS `SystemIdInfo`");
                aVar.c("DROP TABLE IF EXISTS `WorkName`");
                aVar.c("DROP TABLE IF EXISTS `WorkProgress`");
                aVar.c("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                int i10 = WorkDatabase_Impl.s;
                List<g.b> list2 = workDatabase_Impl.f14771g;
                if (list2 != null) {
                    int size2 = list2.size();
                    while (i8 < size2) {
                        workDatabase_Impl.f14771g.get(i8).getClass();
                        i8++;
                    }
                }
                aVar3.a(aVar);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i6 + " to " + i7 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public final void c(z1.a aVar) throws SQLException {
        a2.a aVar2 = (a2.a) aVar;
        aVar2.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aVar2.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }
}
