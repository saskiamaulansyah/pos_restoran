# SQL Change LOG for integrated team

### 09-07-2021
> Bima (nambah kolom status di table pembayaran)
``` SQL
ALTER TABLE `pembayaran` ADD `id_meja` INT NOT NULL AFTER `grand_total`;
ALTER TABLE `pembayaran` ADD `status` ENUM('COMPLETE','WAITING') NULL AFTER `id_meja`;
```

### 03-07-2021
> Bima (nambah kolom status di table pemesanan)
``` SQL
ALTER TABLE `pemesanan` ADD `status` ENUM("COMPLETE","PENDING") NOT NULL AFTER `id_menu`; 
```


> Angger (nambah kolom status di table meja)
``` SQL
alter table meja add status varchar(20) null;

```
> Saskia (change kolom alamat)
```SQL

ALTER TABLE `karyawan` CHANGE `alamat` `alamat` VARCHAR(30) NOT NULL, CHANGE `tgl_lahir` `tgl_lahir` VARCHAR(15) NOT NULL;

```

### fix pro
- PDF Generate waktu download report
- Fixing refresh page di sisi customer waktu pemesanan
- Fixing order jika minus terisi 


### yang di kumpulkan
- file txt -> nama kelompok dan nrp
- project besar nya
- screen shoot per apps nya