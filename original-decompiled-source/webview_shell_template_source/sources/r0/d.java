package r0;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final w.f<a, ProviderInfo> f14220a = new w.f<>(2);

    /* renamed from: b, reason: collision with root package name */
    public static final c f14221b = new c();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f14222a;

        /* renamed from: b, reason: collision with root package name */
        public String f14223b;

        /* renamed from: c, reason: collision with root package name */
        public List<List<byte[]>> f14224c;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f14222a, aVar.f14222a) && Objects.equals(this.f14223b, aVar.f14223b) && Objects.equals(this.f14224c, aVar.f14224c);
        }

        public final int hashCode() {
            return Objects.hash(this.f14222a, this.f14223b, this.f14224c);
        }
    }

    public static k a(Context context, List list) {
        Trace.beginSection(d2.a.d("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < list.size(); i6++) {
                e eVar = (e) list.get(i6);
                ProviderInfo providerInfoB = b(context.getPackageManager(), eVar, context.getResources());
                if (providerInfoB == null) {
                    return new k();
                }
                arrayList.add(c(context, eVar, providerInfoB.authority));
            }
            return new k(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, e eVar, Resources resources) {
        c cVar = f14221b;
        w.f<a, ProviderInfo> fVar = f14220a;
        Trace.beginSection(d2.a.d("FontProvider.getProvider"));
        try {
            List<List<byte[]>> listB = eVar.f14228d;
            String str = eVar.f14225a;
            String str2 = eVar.f14226b;
            if (listB == null) {
                listB = l0.e.b(resources, 0);
            }
            a aVar = new a();
            aVar.f14222a = str;
            aVar.f14223b = str2;
            aVar.f14224c = listB;
            ProviderInfo providerInfoA = fVar.a(aVar);
            if (providerInfoA != null) {
                return providerInfoA;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, cVar);
            for (int i6 = 0; i6 < listB.size(); i6++) {
                ArrayList arrayList2 = new ArrayList(listB.get(i6));
                Collections.sort(arrayList2, cVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i7), (byte[]) arrayList2.get(i7))) {
                            break;
                        }
                    }
                    fVar.b(aVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static l[] c(Context context, e eVar, String str) {
        Trace.beginSection(d2.a.d("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(d2.a.d("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {eVar.f14227c};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e6) {
                            Log.w("FontsProvider", "Unable to query the content provider", e6);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i6 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new l(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i6));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return (l[]) arrayList.toArray(new l[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
