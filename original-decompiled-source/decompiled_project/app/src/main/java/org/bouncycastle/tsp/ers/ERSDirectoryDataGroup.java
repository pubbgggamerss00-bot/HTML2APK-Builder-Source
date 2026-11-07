package org.bouncycastle.tsp.ers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ERSDirectoryDataGroup extends ERSDataGroup {
    public ERSDirectoryDataGroup(File file) throws FileNotFoundException {
        super(buildGroup(file));
    }

    private static List<ERSData> buildGroup(File file) throws FileNotFoundException {
        ERSCachingData eRSFileData;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("file reference does not refer to directory");
        }
        File[] fileArrListFiles = file.listFiles();
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (int i10 = 0; i10 != fileArrListFiles.length; i10++) {
            if (!fileArrListFiles[i10].isDirectory()) {
                eRSFileData = new ERSFileData(fileArrListFiles[i10]);
            } else if (fileArrListFiles[i10].listFiles().length != 0) {
                eRSFileData = new ERSDirectoryDataGroup(fileArrListFiles[i10]);
            }
            arrayList.add(eRSFileData);
        }
        return arrayList;
    }

    public List<ERSFileData> getFiles() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 != this.dataObjects.size(); i10++) {
            if (this.dataObjects.get(i10) instanceof ERSFileData) {
                arrayList.add((ERSFileData) this.dataObjects.get(i10));
            }
        }
        return arrayList;
    }

    public List<ERSDirectoryDataGroup> getSubdirectories() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 != this.dataObjects.size(); i10++) {
            if (this.dataObjects.get(i10) instanceof ERSDirectoryDataGroup) {
                arrayList.add((ERSDirectoryDataGroup) this.dataObjects.get(i10));
            }
        }
        return arrayList;
    }
}
