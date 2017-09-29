$(document).ready(function () {
        $("#pit-scheduler").pitScheduler({
            locale: 'en',
            defaultDisplay: 'months',
            hideEmptyLines: true,
            disableLabelsMovement: false,
            defaultGroupName: 'Default group',
            defaultDate: '2016-09-01 16:30',
            disableNotifications: false,
            notificationDuration: 4000,
            hideSpinner: true,
            onChange: '',
            onTaskCreation: '',
            onUserCreation: '',
            onTaskRemoval: '',
            onUserRemoval: '',
            onUserEdition: '',
            onTaskAssignation: '',
            onUserTaskDeletion: '',
            onTaskEdition: '',
            disableUndo: false,
            resizeTask: true,
            tasks:  [
                {
                    id: 'djJ3d7sjk928S0',
                    name: 'Jacuzzi access',
                    description: 'Allows users to access to the jacuzzi',
                    color: '#fcd720',
                    tag: 'limited places',
                    tagColor: '#50d371'
                },
                {
                    id: 'fJD67Bd4jh7',
                    name: 'SPA access',
                    description: 'Allows usesr to access to the SPA',
                    color: '#E91E63'
                },
                {
                    id: 'dj8aA9nL0Su7',
                    name: 'Internet access',
                    description: 'Allows users to access to internet',
                    color: '#536DFE'
                },
                {
                    id: 'fLKd67zPkj',
                    name: 'VIP services',
                    color: '#50d371',
                    tag: 'Only VIPs',
                    tagColor: '#d200a5'
                }
            ],
            users: [
                   {
                    name: 'Ai WeiWei',
                    group: 'Group A',
                    tasks: [
                        {
                            id: 'djJ3d7sjk928S0',
                            start_date: '2015-09-10 00:00',
                            end_date: '2016-09-20 00:00'
                        },
                        {
                            id: 'djJ3d7sjk928S0',
                            start_date: '2016-09-28 6:00',
                            end_date: '2017-09-28 18:30'
                        },
                        {
                            id: 'fJD67Bd4jh7',
                            start_date: '2016-09-08 10:40',
                            end_date: '2016-09-21 16:00'
                        },
                        {
                            id: 'fJD67Bd4jh7',
                            start_date: '2016-09-23 10:10',
                            end_date: '2016-09-29 16:50'
                        },
                        {
                            id: 'fLKd67zPkj',
                            start_date: '2016-09-10 08:00',
                            end_date: '2016-09-12 20:00'
                        }
                    ]
                },
                {
                    name: 'Michel Petrucciani',
                    group: 'Group A',
                    tasks: [
                        {
                            id: 'djJ3d7sjk928S0',
                            start_date: '2016-09-01 06:00',
                            end_date: '2016-09-04 00:00'
                        },
                        {
                            id: 'djJ3d7sjk928S0',
                            start_date: '2016-09-04 11:00',
                            end_date: '2016-09-08 18:00'
                        },
                        {
                            id: 'fLKd67zPkj',
                            start_date: '2016-09-07 17:00',
                            end_date: '2016-09-11 20:00'
                        }
                    ]
                },
                {
                    name: 'Jimi Hendrix',
                    group: 'Group B',
                    tasks: [
                        {
                            id: 'djJ3d7sjk928S0',
                            start_date: '2016-09-01 02:30',
                            end_date: '2016-09-03 09:00'
                        },
                        {
                            id: 'djJ3d7sjk928S0',
                            start_date: '2016-09-04 17:30',
                            end_date: '2016-09-24 07:42'
                        },
                        {
                            id: 'dj8aA9nL0Su7',
                            start_date: '2016-09-02 17:30',
                            end_date: '2016-09-11 07:42'
                        },
                        {
                            id: 'fJD67Bd4jh7',
                            start_date: '2016-09-13 10:00',
                            end_date: '2016-09-26 16:00'
                        },
                        {
                            id: 'fJD67Bd4jh7',
                            start_date: '2016-09-30 10:00',
                            end_date: '2016-10-05 16:00'
                        },
                        {
                            id: 'fJD67Bd4jh7',
                            start_date: '2016-10-23 10:00',
                            end_date: '2016-11-04 16:00'
                        },
                        {
                            id: 'fJD67Bd4jh7',
                            start_date: '2016-11-06 10:00',
                            end_date: '2016-11-09 16:00'
                        },
                        {
                            id: 'fJD67Bd4jh7',
                            start_date: '2016-11-10 10:00',
                            end_date: '2016-11-21 16:00'
                        },
                        {
                            id: 'fLKd67zPkj',
                            start_date: '2016-09-01 08:00',
                            end_date: '2016-09-10 18:00'
                        },
                        {
                            id: 'fLKd67zPkj',
                            start_date: '2016-09-12 08:00',
                            end_date: '2016-09-21 18:00'
                        }
                    ]
                }
            ]
        });

    });

$.get( "/api/mens", { firstName: "Aydin", lastName: "Erdas", age: 25 } )
  .done(function( data ) {
    $( ".mens-table-body" ).append(
        "<tr>" +
            "<td>" + data.firstName + "</td>" +
            "<td>" + data.lastName + "</td>" +
            "<td>" + data.age + "</td>" +
        "</tr>"
     );
     $( ".dataTables_empty" ).remove();
    //console.log(data);
});

// Vul hieronder je object, zoals deze er in Java uit ziet.
var obj = {
    firstName: "Johan",
    lastName: "de Boer",
    age: 10,
}

// Verstuur object
$(".mens-btn").on('click', function(event){
    event.stopPropagation();
    event.stopImmediatePropagation();

    $("#hideme").hide();

    obj.firstName = $("#mens-naam").val();
    obj.lastName = $("#mens-achternaam").val();
    obj.age = $("#mens-leeftijd").val();

    $.ajax({
            url: "/api/mens",
            type: "POST",
            data: JSON.stringify(obj),
            contentType: "application/json; charset=utf-8",
        success: function(result) {
            console.log(result);
        },
        error: function(err) {
            console.log(err);
        }
    });
});
