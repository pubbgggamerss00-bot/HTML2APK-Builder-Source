package org.bouncycastle.mime;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import v5.b;

/* loaded from: classes3.dex */
public abstract class MimeWriter {
    protected final Headers headers;

    public MimeWriter(Headers headers) {
        this.headers = headers;
    }

    public static List<String> mapToLines(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            StringBuilder sbA = b.a(str, ": ");
            sbA.append(map.get(str));
            arrayList.add(sbA.toString());
        }
        return arrayList;
    }

    public abstract OutputStream getContentStream() throws IOException;

    public Headers getHeaders() {
        return this.headers;
    }
}
