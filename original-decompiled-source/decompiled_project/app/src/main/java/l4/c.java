package l4;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import com.google.android.gms.tasks.OnFailureListener;
import d4.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import u9.a;
import u9.c;
import y9.l;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnFailureListener, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16707c;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3) {
        this.f16705a = obj;
        this.f16706b = obj2;
        this.f16707c = obj3;
    }

    @Override // y9.l.a
    public Object apply(Object obj) {
        l lVar = (l) this.f16705a;
        HashMap map = (HashMap) this.f16706b;
        a.C0302a c0302a = (a.C0302a) this.f16707c;
        ArrayList arrayList = c0302a.f29641b;
        Cursor cursor = (Cursor) obj;
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            int i10 = cursor.getInt(1);
            c.a aVar = c.a.REASON_UNKNOWN;
            if (i10 != 0) {
                if (i10 == 1) {
                    aVar = c.a.MESSAGE_TOO_OLD;
                } else if (i10 == 2) {
                    aVar = c.a.CACHE_FULL;
                } else if (i10 == 3) {
                    aVar = c.a.PAYLOAD_TOO_BIG;
                } else if (i10 == 4) {
                    aVar = c.a.MAX_RETRIES_REACHED;
                } else if (i10 == 5) {
                    aVar = c.a.INVALID_PAYLOD;
                } else if (i10 == 6) {
                    aVar = c.a.SERVER_ERROR;
                } else {
                    v9.a.a(Integer.valueOf(i10), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                }
            }
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(new u9.c(j10, aVar));
        }
        for (Map.Entry entry : map.entrySet()) {
            int i11 = u9.d.f29656c;
            new ArrayList();
            arrayList.add(new u9.d((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
        }
        long jA = lVar.f34340b.a();
        SQLiteDatabase sQLiteDatabaseE = lVar.E();
        sQLiteDatabaseE.beginTransaction();
        try {
            Cursor cursorRawQuery = sQLiteDatabaseE.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
            try {
                cursorRawQuery.moveToNext();
                u9.f fVar = new u9.f(cursorRawQuery.getLong(0), jA);
                cursorRawQuery.close();
                sQLiteDatabaseE.setTransactionSuccessful();
                sQLiteDatabaseE.endTransaction();
                c0302a.f29640a = fVar;
                c0302a.f29642c = new u9.b(new u9.e(lVar.E().compileStatement("PRAGMA page_size").simpleQueryForLong() * lVar.E().compileStatement("PRAGMA page_count").simpleQueryForLong(), y9.a.f34316f.f34317a));
                c0302a.f29643d = lVar.f34343e.get();
                return new u9.a(c0302a.f29640a, Collections.unmodifiableList(arrayList), c0302a.f29642c, c0302a.f29643d);
            } catch (Throwable th2) {
                cursorRawQuery.close();
                throw th2;
            }
        } catch (Throwable th3) {
            sQLiteDatabaseE.endTransaction();
            throw th3;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$2((CancellationSignal) this.f16705a, (Executor) this.f16706b, (t) this.f16707c, exc);
    }
}
