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