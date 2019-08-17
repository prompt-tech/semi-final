// jQuery dataTable
// Ajax data
$(document).ready( function () {
     $('#employeesTable thead tr').clone(true).appendTo( '#employeesTable thead' );
     $('#employeesTable thead tr:eq(1) th').each( function (i) {
         var title = $(this).text();
         $(this).html( '<input type="text" placeholder="Search '+title+'" />' );

         $( 'input', this ).on( 'keyup change', function () {
             if ( table.column(i).search() !== this.value ) {
                 table
                     .column(i)
                     .search( this.value )
                     .draw();
             }
         } );
     } );

	 var table = $('#employeesTable').DataTable({
	    orderCellsTop: true,
        fixedHeader: true,
			"sAjaxSource": "/employees",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
		          { "mData": "ssn" },
				  { "mData": "fname" },
				  { "mData": "lname" },
				  { "mData": "bdate" },
				  { "mData": "address" },
				  { "mData": "sex" },
				  { "mData": "salary" },
				  { "mData": "superssn" },
				  { "mData": "dno" }
//				  { "mData": "pnumber" },
//				  { "mData": "hours" },
//				  { "mData": "dnumber" },
//				  { "mData": "dname"},
//				  { "mData": "mgrstartdate" },
//				  { "mData": "dlocation" },
//				  { "mData": "pname" },
//				  { "mData": "plocation"}
			],
			"dom": "Bfrtip",
			"buttons": [
			    'columnsToggle'
			]

	 });

});

