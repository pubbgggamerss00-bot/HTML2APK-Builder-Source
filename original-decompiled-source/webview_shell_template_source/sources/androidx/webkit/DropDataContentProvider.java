package androidx.webkit;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import i2.k;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class DropDataContentProvider extends ContentProvider {
    public DropDataContentProviderBoundaryInterface s;

    public final DropDataContentProviderBoundaryInterface a() {
        if (this.s == null) {
            DropDataContentProviderBoundaryInterface dropDataProvider = k.b.f13361a.getDropDataProvider();
            this.s = dropDataProvider;
            dropDataProvider.onCreate();
        }
        return this.s;
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        return a().call(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("delete method is not supported.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return a().getType(uri);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert method is not supported.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        return a().openFile(this, uri);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return a().query(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("update method is not supported.");
    }
}
