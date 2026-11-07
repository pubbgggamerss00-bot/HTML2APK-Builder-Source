package j7;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements n {
    @Override // j7.n
    public final boolean a(String str) {
        if (str != null) {
            return str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif");
        }
        return false;
    }
}
